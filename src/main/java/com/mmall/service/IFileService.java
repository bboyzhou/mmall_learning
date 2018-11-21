package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zj on 2018/8/28.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
