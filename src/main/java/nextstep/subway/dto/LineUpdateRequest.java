package nextstep.subway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LineUpdateRequest {
    private String name;
    private String color;
}
