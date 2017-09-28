#!/bin/sh

if [ $# -eq 1 ]; then
    if [ $1 = -p ]; then
    git pull
    fi
fi
    git status;
    var1=0;
    while [ $var1 != done ]; do
	echo "\033[34mChoose a file to add (* for all) else 'done' :\033[0m";
	read var1;
	if [ "$var1" != "done" ]; then
	    git add "$var1";
            if [ "$var1" = "*" ]; then
		var1=done;
            fi
	fi
    done
    git status;
    echo "\033[34mReason to push\033[0m";
    read var2;
    git commit -m "$var2";
    if git push; then
	echo "\033[32mNicely done; successful push\033[0m";
    fi


