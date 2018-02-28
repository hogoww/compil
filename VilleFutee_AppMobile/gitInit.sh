#!/bin/bash
# Set a local git repository (add your RSA key to the gitlab project)
####################################################
# Set up your identity:
PRENOM="Theo"
NOM="Rogliano"
# Normaly,this should be name.familyName
GITLOGIN="20115089"
EMAIL="theo.rogliano@umontpellier.fr"
####################################################

usage () {
	echo "usage: $0 existingGitlabProjectName" ;
}

if [  $# -lt 1 ] ; then 
	usage; exit
else

git config --global user.name "$NOM $PRENOM"
git config --global user.email $EMAIL 
#Create Repository
mkdir $1
cd $1
git init
touch README
git add README
git commit -m 'first commit'
git remote add origin git@gitlab.info-ufr.univ-montp2.fr:$GITLOGIN/$1.git
git pull -u origin master
fi
