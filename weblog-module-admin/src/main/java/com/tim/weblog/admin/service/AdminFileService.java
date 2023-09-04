package com.tim.weblog.admin.service;

import com.tim.weblog.common.Response;
import org.springframework.web.multipart.MultipartFile;

public interface AdminFileService {
    Response uploadFile(MultipartFile file);
}
