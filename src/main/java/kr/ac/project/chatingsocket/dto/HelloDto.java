package kr.ac.project.chatingsocket.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HelloDto {
    private String name;
    private Long number;
    private String nickname;
}
