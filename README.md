##问答社区

##资料
[bootstrap文档](https://v3.bootcss.com/components/#navbar)  
[spring 文档](https://spring.io/guides)  
[Github OAuth](https://docs.github.com/en/developers/apps/building-oauth-apps)  
[Spring 官方文档](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

##工具
[Git](https://git-scm.com/download)  
[VP](https://ww.visual-paragigm.com)

## 脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);

```