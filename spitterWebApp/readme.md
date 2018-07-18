# 车购税自助缴税终端系统WEB
### 基础信息
部署到weblogic，接收终端请求，调用service处理
+ 基于JDK-1.6
+ 基于dubbo-2.5.3修改版
+ 基于spring-4.0.9
+ 基于maven-3.2.5

### 各地信息
利用maven  profile打包，默认选择dev（开发环境配置）
+ [湖北](src/main/resources/conf/hubei)
+ 大连	[配置](src/main/resources/conf/dalian)	[需求](doc/dalian.md)
+ 江西  [配置](src/main/resources/conf/jiangxi)	[需求](doc/jiangxi.md)
+ [山东](src/main/resources/conf/shandong)
+ [深圳](src/main/resources/conf/shenzhen)
+ 台州	[配置](src/main/resources/conf/taizhou)	[需求](doc/taizhou.md)
+ [梧州](src/main/resources/conf/wuzhou)
+ [厦门](src/main/resources/conf/xiamen)
+ 重庆	[配置](src/main/resources/conf/chongqing)	[需求](doc/chongqing.md)
+ 内蒙	[配置](src/main/resources/conf/neimeng)		[需求](doc/neimeng.md)
+ 广东	[配置](src/main/resources/conf/guangdong) [文档](doc/guangdong.md)

### 基本操作流程
#### 1、锁屏
		由于配置了开机自启动，终端启动后会自动开启IE的全屏模式，并自动进入锁屏页面。点击输入框的小键盘，弹出键盘，输入解锁密码后点击解锁，进入首页。
<img src="images/1-sp.png" width="50%"></img>

#### 2、扫描合格证
	系统解锁后进入首页，点击下图①图片会弹出进口车二维码扫描窗口，点击下图②图片会弹出国产车二维码扫描窗口，点击下图③区域，会弹出当前票证库存信息。若扫描后获取到合格证信息，系统会自动上传，并在后台做校验。
<img src="images/2-smhgz.png" width="50%"></img>

#### 3、确认申报信息
	申报信息页面展示纳税人信息、车辆信息和发票信息。点击确认进入缴税信息确认页面；点击取消返回首页。
<img src="images/3-qrsbxx.png" width="50%"></img>

#### 4、确认缴税信息
	缴税信息确认页面展示缴税信息，包括：应纳税额、减免税额、应缴税额、滞纳金。
	点击确认进入POS缴款；点击取消返回首页。

#### 5、缴税
	系统自动调用税库银POS机，首先发起纳税申报查询，收到返回信息后再次发起扣款，纳税人按照提示刷卡缴费即可。此过程有点慢（特别是在测试环境下），请耐心等待，若超时可按提示重新申报即可。
	POS扣款完成后，系统等待10秒后自动发起缴费结果查询，缴费成功则自动进入税收完税证明打印页面。
<img src="images/5-js.png" width="50%"></img>

#### 6、打印税收完税证明
	页面展示两秒后，系统自动调用打印机打印税收完税证明，并进入完税证明打印页面。
<img src="images/6-dysswszm.png" width="50%"></img>

#### 7、打印完税证明
	页面展示两秒后，系统自动打印完税证明。
	打印完成后，系统会将系统内的税收完税证明号码和完税证明号码展示，提示核对票证号码，避免打印错误。
<img src="images/7-dywszm.png" width="50%"></img>
<img src="images/7-hdxx.png" width="30%"></img>
