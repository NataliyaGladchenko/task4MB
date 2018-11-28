package model;

public class Profile {
    private int profileId;
    private int userId;
    private String profile;

    public Profile(int profileId, int userId, String profile) {
        this.profileId = profileId;
        this.userId = userId;
        this.profile = profile;
    }

    public Profile() {
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
