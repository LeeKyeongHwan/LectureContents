package com.example.jsmain.entity.jpa;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@Entity
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    private Long memberNo;

    @Column(length = 64, nullable = false)
    private String userId;

    @Column(length = 64, nullable = false)
    private String password;

    @CreationTimestamp
    private Date regDate;

    @UpdateTimestamp
    private Date updDate;

    /* Join Column 파트 */
    //개인인지 사업자인지 구분
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "member_no")
    private List<MemberAuth> authList = new ArrayList<MemberAuth>();

    public Member(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

    public void addAuth(MemberAuth auth) {
        authList.add(auth);
    }

    public void clearAuthList () {
        authList.clear();
    }
}