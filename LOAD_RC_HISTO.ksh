export ORACLE_HOME=/apps/oracle/11.2.0.4/Client
export PATH=$PATH:$ORACLE_HOME/bin/

export NLS_LANG=AMERICAN_AMERICA.WE8ISO8859P1

sqlldr USERID=dnqoa_maj/W41837tomaj@slddfrora019d:10301/DNQA_D PARFILE=RC_HISTO_INTERROGATION.par

sqlldr USERID=dnqoa_maj/W41837tomaj@slddfrora019d:10301/DNQA_D PARFILE=RC_HISTO_COMMENT.par
