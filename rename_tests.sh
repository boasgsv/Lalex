#!/bin/bash

for file in *; do
    # Checking if file starts with number and dash
    if [[ $file =~ ^[0-9]+-.*$  ]]; then
        # Get the number prefix
        prefix=${file%%-*}

        # Rename the file
        mv -- "$file" "$prefix.ct"
    fi
done
