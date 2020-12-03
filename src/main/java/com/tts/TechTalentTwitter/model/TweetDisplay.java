package com.tts.TechTalentTwitter.model;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//bad implementation because it doesn't get stored in the database
//would use @Id if it was going in database
public class TweetDisplay {
    private User user;
    private String message;
    private String date;
    private List<Tag> tags;
    
    
}
