# CellularTour_API
*请各自下载*
#### 包结构

controller:控制层,主要用来接收客户端发来的Http请求(andoird)。Jersey。 

dao:数据访问层,主要用以操作数据库。Hibernate。

model:存放自定义实体类。

pojo：存放数据库相关实体类。

service：业务层。被控制层调用，用以确定Dao层的具体调用模型。是登录还是注册或者其他增删改查等业务。

utils:存放一些工具类.
