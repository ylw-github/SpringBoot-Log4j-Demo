package com.ylw.springboot.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Data
public class UserEntity {

    @Getter
    @Setter
    private String userName;

    @Getter
    @Setter
    private Integer age;

    @Override
    public String toString() {
        return "UserEntity [userName=" + userName + ", age=" + age + "]";
    }


}
