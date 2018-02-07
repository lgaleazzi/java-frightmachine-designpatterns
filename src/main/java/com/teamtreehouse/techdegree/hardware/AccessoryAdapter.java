package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;

public class AccessoryAdapter implements Accessory
{
    private Camera camera;

    public AccessoryAdapter(Camera camera)
    {
        this.camera = camera;
    }

    @Override
    public void activate()
    {
        camera.snapPhotos(5);
    }
}
