const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmo1al9/",
            name: "ssmo1al9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmo1al9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "驾校管理系统小程序"
        } 
    }
}
export default base
