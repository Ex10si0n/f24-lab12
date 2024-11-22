package edu.cmu.Library;

/**
 * Represents a user's ID in the library system, encapsulating the library ID
 * and username.
 */
public class UserId {
    private final String libraryId;
    private final String userName;

    /**
     * Constructs a new UserId from a library ID and username.
     *
     * @param libraryId the library ID associated with the user
     * @param userName the name of the user
     */
    public UserId(String libraryId, String userName) {
        if (libraryId == null || libraryId.isEmpty()) {
            throw new IllegalArgumentException("Library ID cannot be null or empty.");
        }
        if (userName == null || userName.isEmpty()) {
            throw new IllegalArgumentException("User name cannot be null or empty.");
        }
        this.libraryId = libraryId;
        this.userName = userName;
    }

    /**
     * Returns the library ID.
     */
    public String getLibraryId() {
        return libraryId;
    }

    /**
     * Returns the username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Parses a `UserId` from a string in the format "libraryID:userName".
     *
     * @param userId the string representation of the user ID
     * @return a new `UserId` object
     * @throws IllegalArgumentException if the input format is invalid
     */
    public static UserId fromString(String userId) {
        if (userId == null || !userId.contains(":")) {
            throw new IllegalArgumentException("Invalid user ID format. Expected 'libraryID:userName'.");
        }
        String[] parts = userId.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid user ID format. Expected 'libraryID:userName'.");
        }
        return new UserId(parts[0], parts[1]);
    }
}