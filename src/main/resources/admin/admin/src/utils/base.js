const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootx877q/",
            name: "springbootx877q",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootx877q/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生评奖评优管理系统"
        } 
    }
}
export default base
