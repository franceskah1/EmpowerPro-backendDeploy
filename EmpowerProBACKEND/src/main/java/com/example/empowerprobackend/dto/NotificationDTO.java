package com.example.empowerprobackend.dto;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NotificationDTO {

    private Long id;
    private String notificationTypes;
    private String message;
    private LocalDateTime notificationTime;
    private UserSlimDTO userSlimDTO;
}
