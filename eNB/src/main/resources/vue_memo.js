axios.get("http://localhost:8088/eNB/common/renderEnum")
.then((response)=>{
    app.config.globalProperties.$optionHelper=response.data;
    let optionList={};
    for(let i in response.data){
        let optionItemList = new Array();
        for(let j in response.data[i]){
            let obj={Key:j,Value:response.data[i][j]};
            optionItemList.push(obj);
        }
        optionList[i]=optionItemList;
    }
    app.config.globalProperties.$optionList=optionList;
    app.mount('#app')
})
.catch((error)=>{
    console.log(error);
    alert(error.message);
});