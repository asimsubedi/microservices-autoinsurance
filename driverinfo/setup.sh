#!/bin/bash

awk 'BEGIN { for (i = 0; i <= 9; ++i) print "Male,Married,College Degree,12345678"i",OWN_HOME,valid,201"i}' > /data/output.txt && \
java -Ddatafilepath=/data/output.txt -jar app.jar