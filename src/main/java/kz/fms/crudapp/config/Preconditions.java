package kz.fms.crudapp.config;

/**
 * Created by Bolat Ashirbek on 08.06.2020.
 */

public class Preconditions {
    public static <T> T checkNotNull(T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
        return resource;
    }
}
