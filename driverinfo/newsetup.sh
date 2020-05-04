#!/bin/bash

for ((i=1;i<=100;i++)); do
    curl -X POST -d '{"gender":"Male","maritalStatus":"Married","education":"College Degree","ssn":"12345678'$i' ","residencyInfo":{"primaryResidency":"OWN_HOME"},"drivingHistory":{"licenceStatus":"valid","yrsLicenced":2010}}' -H "Content-type: application/json"  http://localhost:9989/api/v1/driverinfo 
done