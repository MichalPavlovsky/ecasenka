package sk.pavlovsky.ecasenka.dto;

public class UserDto {
    public UserDto() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto(String name) {
        this.name = name;
    }
}
