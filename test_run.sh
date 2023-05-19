#! /bin/bash

for i in {1..3}
do
    ${test_name} = "${i}"
    ${full_path} = "test_cases/saida${test_name}"

    if [ -x "${full_path}"]
    then
        echo "Running ${test_name}"
        "java -jar target/lalex-1.0-SNAPSHOT-jar-with-dependencies.jar test-cases/entrada/${i}"
        "diff outputs/${i} test-cases/saida/${i}"   
    else
        echo "test ${i} not found or not executable"
    fi
done