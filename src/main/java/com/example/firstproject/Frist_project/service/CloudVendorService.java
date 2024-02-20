package com.example.firstproject.Frist_project.service;

import com.example.firstproject.Frist_project.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendor(String vendorId);
    public String deleteCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendor();
}
