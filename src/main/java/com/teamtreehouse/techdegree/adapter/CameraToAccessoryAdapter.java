package com.teamtreehouse.techdegree.adapter;

import com.example.accessory.Accessory;
import com.teamtreehouse.techdegree.hardware.Camera;

public class CameraToAccessoryAdapter implements Accessory
{
    private Camera camera;

    public CameraToAccessoryAdapter(Camera camera)
    {
        this.camera = camera;
    }

    @Override
    public void activate()
    {
        camera.snapPhotos(5);
    }
}
