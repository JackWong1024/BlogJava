端口说明:
        8000   Eureka
        9001   Zuul
        9002   Oauth2
        9005   User_server



//设计需求
    //userController  和  blogController  ,skillController暂时先放在一起.后面把博客的新建查询等分离出去.成为一个独立的模块.现在这个 作为主页展示
    //个人主页..提供给用户..只要自己申请域名就可以跳转过来..然后也可以借用现在的用户的这个个人技能 .提供直接在线招聘..