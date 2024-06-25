package common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class SearchCriteria {

    private String condition;
    private String value;

}
