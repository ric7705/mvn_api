# Swagger
spec 主要放在swagger/內,
為了節省code sync的時間, codegen.jar不進版,
要自己抓來放在swagger/內

## code gen
要根據你spec的版本去使用相對應的codegen
- swagger 2.0: swagger-codegen-cli-2.3.0.jar
- openAPI 3.0: openapi-generator-cli-4.1.3

### gen code指令
```
java -jar swagger-codegen-cli-2.3.0.jar generate -i spec.yaml -l spring -c codegen.conf -Dmodels -Dapis
```

-i: input spec file
-l: define language
-c: config file
- Dmodels: generetae model  
- Dapis: generetae api

如果沒加-D開頭的指令, 會生成一些不必要的檔案