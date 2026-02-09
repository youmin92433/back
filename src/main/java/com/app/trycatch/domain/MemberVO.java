package com.app.trycatch.domain;

import com.app.trycatch.audit.Period;
import com.app.trycatch.common.common.enumeration.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of="id")
@Getter @ToString(callSuper = true)
@SuperBuilder
public class MemberVO extends Period {
    private Long id;
    private String memberName;
    private String memberPhone;
    private Long addressId;
    private Status memberStatus;
    private boolean memberAgreePrivacy;

}
