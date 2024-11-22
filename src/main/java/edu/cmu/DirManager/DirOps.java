package edu.cmu.DirManager;

/**
 * Represents directory operations. The implementation should handle
 * directory validation, existence checks, and creation logic internally.
 */
public interface DirOps {
    /**
     * Creates a directory at the specified path.
     *
     * @param path the path where the directory should be created
     * @return 0 if successful,
     *        -1 if the directory already exists,
     *        -2 if the path is invalid
     */
    int createDirectory(String path);
}