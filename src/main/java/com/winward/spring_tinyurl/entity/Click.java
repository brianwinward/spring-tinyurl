package com.winward.spring_tinyurl.entity;

import java.time.LocalDateTime;

import org.springframework.boot.persistence.autoconfigure.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clicks")
public class Click {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "url_id", referencedColumnName = "id")
    private Url urlId;

    @Column(name = "clicked_at", nullable = false)
    private LocalDateTime clickedAt;

    @Column(name = "ip_address" + "varchar(45) not null")
    private String ipAddress;

    @Column(name = "country")
    private String country;

    @Column(name = "referrer")
    private String referrer;

    @Column(name = "user_agent")
    private String userAgent;
}
