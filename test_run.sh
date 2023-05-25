#! /bin/bash



for i in {1..37}; do
    java -jar target/lalex-1.0-SNAPSHOT-jar-with-dependencies.jar test-cases/entrada/${i}.ct test-cases/saida/${i}.out
    diff test-cases/saida/${i}.ct test-cases/saida/${i}.out > test-cases/saida/${i}.diff
    if [ $? -eq 0 ]
    then
        rm -f test-cases/saida/${i}.diff
        echo "Test ${i} passed!"
    else
        echo "Test ${i} failed!"
    fi

done
