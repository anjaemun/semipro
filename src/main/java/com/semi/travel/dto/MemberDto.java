package com.semi.travel.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("Member")
public class MemberDto {
	private int m_code;
    private String m_id;//아이디
    private String m_pw;//비밀번호
    private String m_name;//이름
    private String m_email;//이메일
    private String m_phone;//전화번호
}
