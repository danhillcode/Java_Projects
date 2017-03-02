#!/bin/bash

# Author: Tom Brereton

# A script to convert words into signatures
# Once converted we use
# <sigs.txt xargs java -cp /path/to/class/files  predictive.Sigs2WordsList
# To pass the signatures into the java program

# Change the CLASSPATH variable to suit your project structure
# For example, the IntelliJ class path with files in a 'predictive' package is as follows
# out/production/WS2-3/
CLASSPATH=/workspace/Worksheet3/bin

# File name variable for words and their signatures
WORDSIGSFILE=WordsAndSignatures.txt

# File name variable for any error logs encountered, default is to ignore and bin any error output
ERRORSFILE=/dev/null

# File name variable for signatures
SIGNATURESFILE=signatures.txt

# Words to signature program name
W2SPROTO=predictive.Words2SigProto
S2WPROTO=predictive.Sigs2WordsProto
S2WLIST=predictive.Sigs2WordsList

printf "################################################################"
printf "\nThis script should be run in the root folder of your project\n"
printf "\nIf you encounter the 'cannot find classpath' error, edit the\nscript and change the value of CLASSPATH variable\n"
printf "################################################################\n"

printf "\nEnter filename for article containing words to convert to signatures.\n(Type article.txt to run it with packaged file)\n"
read filename

printf "\nSaving words and their signatures to 'WordsAndSignatures.txt' file\n"
<$filename xargs java -cp $CLASSPATH $W2SPROTO > $WORDSIGSFILE 2> $ERRORSFILE

printf "\nSaving numeric signatures to 'signatures.txt' file\n"
sed 's/[A-Za-z]*[:]*//' <$WORDSIGSFILE > $SIGNATURESFILE 

printf "\nRunning Sig2WordsPrototype (suppressing output)...\n"

# We supress the output by sending it to bin via the $ERRORSFILE
time <$SIGNATURESFILE xargs java -cp $CLASSPATH $S2WPROTO > $ERRORSFILE
printf "\nRunning Sigs2WordsList (suppressing output)...\n"
time <$SIGNATURESFILE xargs java -cp $CLASSPATH $S2WLIST > $ERRORSFILE
