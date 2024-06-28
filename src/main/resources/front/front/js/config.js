
var projectName = '学生评奖评优管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '学生成绩',
	url: './pages/xueshengchengji/list.html'
}, 
{
	name: '奖学金申请',
	url: './pages/jiangxuejinshenqing/list.html'
}, 
{
	name: '奖学金获得情况',
	url: './pages/jiangxuejinhuodeqingkuang/list.html'
}, 
{
	name: '获奖证书',
	url: './pages/huojiangzhengshu/list.html'
}, 
{
	name: '好人好事证明',
	url: './pages/haorenhaoshizhengming/list.html'
}, 
{
	name: '信息异议反馈',
	url: './pages/xinxiyiyifankui/list.html'
}, 
{
	name: '纪律通报',
	url: './pages/jilvtongbao/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbootx877q/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","成绩录入"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"院系信息","menuJump":"列表","tableName":"yuanxixinxi"}],"menu":"院系信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"奖学金申请","menuJump":"列表","tableName":"jiangxuejinshenqing"}],"menu":"奖学金申请管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"奖学金获得情况","menuJump":"列表","tableName":"jiangxuejinhuodeqingkuang"}],"menu":"奖学金获得情况管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"信息异议反馈","menuJump":"列表","tableName":"xinxiyiyifankui"}],"menu":"信息异议反馈管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"纪律通报","menuJump":"列表","tableName":"jilvtongbao"}],"menu":"纪律通报管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生成绩列表","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩模块"},{"child":[{"buttons":["查看","申请奖学金"],"menu":"奖学金申请列表","menuJump":"列表","tableName":"jiangxuejinshenqing"}],"menu":"奖学金申请模块"},{"child":[{"buttons":["查看"],"menu":"奖学金获得情况列表","menuJump":"列表","tableName":"jiangxuejinhuodeqingkuang"}],"menu":"奖学金获得情况模块"},{"child":[{"buttons":["新增","查看"],"menu":"获奖证书列表","menuJump":"列表","tableName":"huojiangzhengshu"}],"menu":"获奖证书模块"},{"child":[{"buttons":["新增","查看"],"menu":"好人好事证明列表","menuJump":"列表","tableName":"haorenhaoshizhengming"}],"menu":"好人好事证明模块"},{"child":[{"buttons":["查看","新增"],"menu":"信息异议反馈列表","menuJump":"列表","tableName":"xinxiyiyifankui"}],"menu":"信息异议反馈模块"},{"child":[{"buttons":["查看"],"menu":"纪律通报列表","menuJump":"列表","tableName":"jilvtongbao"}],"menu":"纪律通报模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"buttons":["查看","删除"],"menu":"奖学金申请","menuJump":"列表","tableName":"jiangxuejinshenqing"}],"menu":"奖学金申请管理"},{"child":[{"buttons":["查看"],"menu":"奖学金获得情况","menuJump":"列表","tableName":"jiangxuejinhuodeqingkuang"}],"menu":"奖学金获得情况管理"},{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"获奖证书","menuJump":"列表","tableName":"huojiangzhengshu"}],"menu":"获奖证书管理"},{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"好人好事证明","menuJump":"列表","tableName":"haorenhaoshizhengming"}],"menu":"好人好事证明管理"},{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"信息异议反馈","menuJump":"列表","tableName":"xinxiyiyifankui"}],"menu":"信息异议反馈管理"},{"child":[{"buttons":["查看"],"menu":"纪律通报","menuJump":"列表","tableName":"jilvtongbao"}],"menu":"纪律通报管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生成绩列表","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩模块"},{"child":[{"buttons":["查看","申请奖学金"],"menu":"奖学金申请列表","menuJump":"列表","tableName":"jiangxuejinshenqing"}],"menu":"奖学金申请模块"},{"child":[{"buttons":["查看"],"menu":"奖学金获得情况列表","menuJump":"列表","tableName":"jiangxuejinhuodeqingkuang"}],"menu":"奖学金获得情况模块"},{"child":[{"buttons":["新增","查看"],"menu":"获奖证书列表","menuJump":"列表","tableName":"huojiangzhengshu"}],"menu":"获奖证书模块"},{"child":[{"buttons":["新增","查看"],"menu":"好人好事证明列表","menuJump":"列表","tableName":"haorenhaoshizhengming"}],"menu":"好人好事证明模块"},{"child":[{"buttons":["查看","新增"],"menu":"信息异议反馈列表","menuJump":"列表","tableName":"xinxiyiyifankui"}],"menu":"信息异议反馈模块"},{"child":[{"buttons":["查看"],"menu":"纪律通报列表","menuJump":"列表","tableName":"jilvtongbao"}],"menu":"纪律通报模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"buttons":["审核","查看","删除"],"menu":"获奖证书","menuJump":"列表","tableName":"huojiangzhengshu"}],"menu":"获奖证书管理"},{"child":[{"buttons":["审核","查看","删除"],"menu":"好人好事证明","menuJump":"列表","tableName":"haorenhaoshizhengming"}],"menu":"好人好事证明管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"纪律通报","menuJump":"列表","tableName":"jilvtongbao"}],"menu":"纪律通报管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生成绩列表","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩模块"},{"child":[{"buttons":["查看","申请奖学金"],"menu":"奖学金申请列表","menuJump":"列表","tableName":"jiangxuejinshenqing"}],"menu":"奖学金申请模块"},{"child":[{"buttons":["查看"],"menu":"奖学金获得情况列表","menuJump":"列表","tableName":"jiangxuejinhuodeqingkuang"}],"menu":"奖学金获得情况模块"},{"child":[{"buttons":["新增","查看"],"menu":"获奖证书列表","menuJump":"列表","tableName":"huojiangzhengshu"}],"menu":"获奖证书模块"},{"child":[{"buttons":["新增","查看"],"menu":"好人好事证明列表","menuJump":"列表","tableName":"haorenhaoshizhengming"}],"menu":"好人好事证明模块"},{"child":[{"buttons":["查看","新增"],"menu":"信息异议反馈列表","menuJump":"列表","tableName":"xinxiyiyifankui"}],"menu":"信息异议反馈模块"},{"child":[{"buttons":["查看"],"menu":"纪律通报列表","menuJump":"列表","tableName":"jilvtongbao"}],"menu":"纪律通报模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
