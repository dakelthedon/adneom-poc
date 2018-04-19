#!/bin/bash
set +x

        if test $# -ne 3
                then echo -e '\tP1: filename\n\tP2: login\n\tP3: password';exit 1
        fi

	echo "INTERROGATION_ID|FILE_NAME|DOCUMENT" > RC_HISTO_DOCUMENT.dat

	numero=0
        while IFS= read -r line; do
                fileName4Work=`echo "$line" | cut -d \; -f 1`
                fileUrl=$(python -c "import urllib, sys; print urllib.quote(sys.argv[1])"  "$fileName4Work")
                interrogationId=`echo $fileName4Work | cut -d \= -f 1`
		fileName=`echo $fileName4Work | cut -d \= -f 2`
		file="""./recif.files/$fileName"
		echo "$interrogationId|$fileName|$file" >> RC_HISTO_DOCUMENT.dat

                curl --ntlm -v -u CIB\\$2:$3 http://sharecib.intranet/sites/RECIF/fr/Lists/Fichiers/$fileUrl > "./recif.files/$fileName"

                sleep 1
		numero=$(($numero + 1))
		echo $numero 
 		if [ "$numero" -eq 3 ] 
 		then
			break
			echo $numero
		fi
        done < "$1"

	sqlldr USERID=dnqoa_maj/W41837tomaj@slddfrora019d:10301/DNQA_D PARFILE=RC_HISTO_DOCUMENT.par

