#!/bin/bash

java -jar swagger/swagger-codegen-cli-2.3.0.jar generate -i swagger/spec.yaml -l spring-boot -c swagger/codegen.conf -Dmodels -Dapis