package com.luoru.utils;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @author: Luoru
 * @date: 2020/1/13 15:56
 * @description: 图片上传工具类
 */
public class ImageUploadUtil {

    public static String upLoadImg(HttpServletRequest req) {
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        List items = null;
        FileItem item;
        String fileName = null;
        //解析请求信息
        try {
            items = upload.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        assert items != null;
        for (Object obj : items) {
            item = (FileItem) obj;
            if (!item.isFormField()) {

                fileName = item.getName();
                int index = fileName.lastIndexOf(".");
                //图片名称使用当前时间戳命名，保证名称唯一性
                fileName = System.currentTimeMillis() + fileName.substring(index);
                req.setAttribute("realFileName", fileName);
                File baseDir = new File("D:\\MyProject\\YouMall\\target\\YouMall\\images\\goods");
                File targetFile = new File(baseDir, fileName);
                fileName = "images\\goods\\" + fileName;
                try {
                    if (!targetFile.exists()) {
                        boolean newFile = targetFile.createNewFile();
                        if (!newFile) {
                            System.out.println("文件创建失败！！！");
                        }
                    }
                    item.write(targetFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return fileName;
    }
}
