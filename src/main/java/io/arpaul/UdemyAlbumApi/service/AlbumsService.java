package io.arpaul.UdemyAlbumApi.service;

import java.util.List;

import io.arpaul.UdemyAlbumApi.data.AlbumEntity;

public interface AlbumsService {
	List<AlbumEntity> getAlbums(String userId);
}
