package com.haoruigang.retrofit.retrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 后台返回接收的数据
 * Created by 13739 on 2018/1/9.
 */

public class Result {


    /**
     * id : 11282
     * subLemmaId : 18119214
     * newLemmaId : 274667
     * key : 哈哈
     * desc : 汉字词语
     * title : 哈哈
     * card : [{"key":"m25_nameC","name":"中文名","value":["哈哈"],"format":["哈哈"]},{"key":"m25_nameE","name":"外文名","value":["HA-HA"],"format":["HA-HA"]},{"key":"m25_ext_0","name":"拼音","value":["hā hā"],"format":["hā hā"]},{"key":"m25_ext_1","name":"基本简介","value":["人的一种笑声"],"format":["人的一种笑声"]},{"key":"m25_ext_2","name":"形容","value":["<a target=_blank href=\"/item/%E9%AB%98%E5%85%B4\">高兴<\/a>，<a target=_blank href=\"/item/%E5%BC%80%E5%BF%83/30\" data-lemmaid=\"30\">开心<\/a>，<a target=_blank href=\"/item/%E5%85%B4%E5%A5%8B/33165\" data-lemmaid=\"33165\">兴奋<\/a>"],"format":["<a target=_blank href=\"/item/%E9%AB%98%E5%85%B4\">高兴<\/a>，<a target=_blank href=\"/item/%E5%BC%80%E5%BF%83/30\" data-lemmaid=\"30\">开心<\/a>，<a target=_blank href=\"/item/%E5%85%B4%E5%A5%8B/33165\" data-lemmaid=\"33165\">兴奋<\/a>"]},{"key":"m25_ext_3","name":"出处","value":["《<a target=_blank href=\"/item/%E6%B0%B4%E6%B5%92%E4%BC%A0/348\" data-lemmaid=\"348\">水浒传<\/a>》"],"format":["《<a target=_blank href=\"/item/%E6%B0%B4%E6%B5%92%E4%BC%A0/348\" data-lemmaid=\"348\">水浒传<\/a>》"]},{"key":"m25_ext_4","name":"其他含义","value":["指人通常用来开玩笑"],"format":["指人通常用来开玩笑"]},{"key":"m25_ext_5","name":"词性","value":["<a target=_blank href=\"/item/%E6%8B%9F%E5%A3%B0%E8%AF%8D\">拟声词<\/a>"],"format":["<a target=_blank href=\"/item/%E6%8B%9F%E5%A3%B0%E8%AF%8D\">拟声词<\/a>"]},{"key":"m25_ext_6","name":"用法","value":["用来表示开心，<a target=_blank href=\"/item/%E5%85%B4%E5%A5%8B/5804916\" data-lemmaid=\"5804916\">兴奋<\/a>"],"format":["用来表示开心，<a target=_blank href=\"/item/%E5%85%B4%E5%A5%8B/5804916\" data-lemmaid=\"5804916\">兴奋<\/a>"]},{"key":"m25_ext_7","name":"引用","value":["哇\u201c哈哈\u201d"],"format":["哇\u201c哈哈\u201d"]}]
     * imageHeight : 0
     * imageWidth : 0
     * isSummaryPic : n
     * abstract : 指一个人发自内心的笑声，高兴欢乐时的状态，抒发快乐的心情，表现一个人很开心的状态。也指人通常用来开玩笑。人的一种笑声，高兴，开心。出处：《水浒传》第三一回：“武松讨面镜子照了，也自哈哈大笑起来。”
     * moduleIds : []
     * url : http://baike.baidu.com/subview/11282/18119214.htm
     * wapUrl : http://wapbaike.baidu.com/item/%E5%93%88%E5%93%88/274667
     * hasOther : 1
     * totalUrl : http://baike.baidu.com/view/11282.htm
     * catalog : ["<a href='http://baike.baidu.com/subview/11282/18119214.htm#1'>大笑声<\/a>","<a href='http://baike.baidu.com/subview/11282/18119214.htm#2'>谓开玩笑<\/a>","<a href='http://baike.baidu.com/subview/11282/18119214.htm#3'>叹词<\/a>","<a href='http://baike.baidu.com/subview/11282/18119214.htm#4'>其他解释<\/a>"]
     * wapCatalog : ["<a href='http://wapbaike.baidu.com/item/%E5%93%88%E5%93%88/274667#1'>大笑声<\/a>","<a href='http://wapbaike.baidu.com/item/%E5%93%88%E5%93%88/274667#2'>谓开玩笑<\/a>","<a href='http://wapbaike.baidu.com/item/%E5%93%88%E5%93%88/274667#3'>叹词<\/a>","<a href='http://wapbaike.baidu.com/item/%E5%93%88%E5%93%88/274667#4'>其他解释<\/a>"]
     * logo : http://img.baidu.com/img/baike/logo-baike.gif
     * copyrights : 以上内容来自百度百科平台，由百度百科网友创作。
     * customImg :
     * redirect : []
     */

    private int id;
    private int subLemmaId;
    private int newLemmaId;
    private String key;
    private String desc;
    private String title;
    private int imageHeight;
    private int imageWidth;
    private String isSummaryPic;
    @SerializedName("abstract")
    private String abstractX;
    private String url;
    private String wapUrl;
    private int hasOther;
    private String totalUrl;
    private String logo;
    private String copyrights;
    private String customImg;
    private List<CardBean> card;
    private List<?> moduleIds;
    private List<String> catalog;
    private List<String> wapCatalog;
    private List<?> redirect;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubLemmaId() {
        return subLemmaId;
    }

    public void setSubLemmaId(int subLemmaId) {
        this.subLemmaId = subLemmaId;
    }

    public int getNewLemmaId() {
        return newLemmaId;
    }

    public void setNewLemmaId(int newLemmaId) {
        this.newLemmaId = newLemmaId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getIsSummaryPic() {
        return isSummaryPic;
    }

    public void setIsSummaryPic(String isSummaryPic) {
        this.isSummaryPic = isSummaryPic;
    }

    public String getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(String abstractX) {
        this.abstractX = abstractX;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWapUrl() {
        return wapUrl;
    }

    public void setWapUrl(String wapUrl) {
        this.wapUrl = wapUrl;
    }

    public int getHasOther() {
        return hasOther;
    }

    public void setHasOther(int hasOther) {
        this.hasOther = hasOther;
    }

    public String getTotalUrl() {
        return totalUrl;
    }

    public void setTotalUrl(String totalUrl) {
        this.totalUrl = totalUrl;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public String getCustomImg() {
        return customImg;
    }

    public void setCustomImg(String customImg) {
        this.customImg = customImg;
    }

    public List<CardBean> getCard() {
        return card;
    }

    public void setCard(List<CardBean> card) {
        this.card = card;
    }

    public List<?> getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(List<?> moduleIds) {
        this.moduleIds = moduleIds;
    }

    public List<String> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<String> catalog) {
        this.catalog = catalog;
    }

    public List<String> getWapCatalog() {
        return wapCatalog;
    }

    public void setWapCatalog(List<String> wapCatalog) {
        this.wapCatalog = wapCatalog;
    }

    public List<?> getRedirect() {
        return redirect;
    }

    public void setRedirect(List<?> redirect) {
        this.redirect = redirect;
    }

    public static class CardBean {
        /**
         * key : m25_nameC
         * name : 中文名
         * value : ["哈哈"]
         * format : ["哈哈"]
         */

        private String key;
        private String name;
        private List<String> value;
        private List<String> format;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getValue() {
            return value;
        }

        public void setValue(List<String> value) {
            this.value = value;
        }

        public List<String> getFormat() {
            return format;
        }

        public void setFormat(List<String> format) {
            this.format = format;
        }
    }
}
