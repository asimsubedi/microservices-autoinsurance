#!/bin/bash

awk 'BEGIN { for (i = 1; i <= 10; ++i) print "EkthaSol-" i ",Solutions,10/12/1991,1234,MeroGhar,Irving,Tx,90602"}' > /data/output.txt && \
java -Ddatafilepath=/data/output.txt -jar app.jar