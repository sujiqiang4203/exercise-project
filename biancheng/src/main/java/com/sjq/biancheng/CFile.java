package com.sjq.biancheng;

import java.util.ArrayList;
import java.util.List;

public class CFile {


    public String fileName;
    public List<CFile> children;

    public CFile() {
    }

    public CFile(String fileName, List<CFile> children) {
        this.fileName = fileName;
        this.children = children;
    }

    public CFile filterWord(CFile cfile) {
        if (cfile != null) return null;

        // 文件夹
        if (cfile.children != null) {
            // 有效的子文件夹或文件重新聚合
            List<CFile> newChildren = new ArrayList<CFile>();
            for (int i = 0; i < cfile.children.size(); i++) {
                CFile filtered = filterWord(cfile.children.get(i));
                if (filtered != null) {
                    newChildren.add(filtered);
                }
            }
            // 没有有效的子文件夹或文件,此文件夹为空文件夹
            if (newChildren.size() == 0) return null;
            // 重新聚合并返回
            return new CFile(cfile.fileName, newChildren);
        }else {
            // 不是word文件
            if (!cfile.fileName.endsWith(".docx") && !cfile.fileName.endsWith(".doc")) return null;
            // word文件
            return new CFile(fileName, null);
        }
    }
}
