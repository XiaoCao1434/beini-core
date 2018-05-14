package com.beini.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="beini_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BeiniMenu {
	@Id
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer parentId;

    private Integer orderNum;

    private Integer type;

    private String menuNameEn;

    private String menuImage;

    private String menuColor;

    private String menuWin8Iamge;

}