var currentPage = 1;//当前页码统计数
var pageSize = 14;

$(document).ready(function () {
    getProductList();//加载数据

    $("#nextLoad").click(function () {
        loadProduct();
    });
});
function getProductList() {

    $.ajax({
        url: ctx + "/wx/product/list.htm?pageSize=" + pageSize + "&currentPage=" + currentPage,
        type: 'get',
        dataType: 'json',
        success: function (data) {
            if (data != '') {

                if (data.resultStatus != 200) {
                    alert('系统错误!' + data.resultMessage);
                }
                var produces = data.resultProducts;
                var innerHtml = '';
                for (var i = 0; i < produces.length; i++) {
                    var prd = produces[i];
                    innerHtml = innerHtml + buildingData(prd);
                }
                result = innerHtml;
                addData(result);
                $("#loadImage").hide();
            }
        }
    });
}

//加载 下一页
function loadProduct() {
    $("#loadImage").show();
    currentPage++;
    getProductList();
}
function addData(o) {
    var dataList = $("#proList");//判断 数据列表中 是否有数据  如果没有 就append  如果有就添加到 最后

//    dataList.children().last().before(o);
    dataList.append(o);
}
function buildingData(obj) {
//    var str = "<li><div class='zzc'>" + obj.listTitle + "</div><a  href='" + ctx + "/product/datil/" + obj.productId + "'><img src='" + uploadUrl + "/" + obj.listImage + "' alt='" + obj.listTitle + "'/></a></li>";
    var str = "<li><a  href='" + ctx + "/wx/product/datil.htm?kuser=" + cookieUser + "&productId=" + obj.productId + "'><img src='" + uploadUrl + "/" + obj.listImage + "' alt='" + obj.listTitle + "'/></a></li>";
    return str;
}
