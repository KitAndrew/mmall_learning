package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created By Kit.Andrew.Lee on 2018/7/14.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
