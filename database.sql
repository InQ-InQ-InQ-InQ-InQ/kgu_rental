CREATE TABLE `kgu_rental`.`user` (
                                     `userId` INT NOT NULL,
                                     `userPassword` VARCHAR(45) NOT NULL,
                                     `userName` VARCHAR(45) NOT NULL,
                                     `userPhonenumber` VARCHAR(45) NULL,
                                     PRIMARY KEY (`userId`));
//Charset: utf8mb4, Collation: utf8mb4_bin, Engine : InnoDB
//db 연결후 스프링 콘솔 창에 Initialized JPA, Tomcat started on port(s): 8080 생성되면 정상적으로 동작하는 것.