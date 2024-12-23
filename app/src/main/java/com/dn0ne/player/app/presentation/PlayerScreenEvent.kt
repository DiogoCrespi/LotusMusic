package com.dn0ne.player.app.presentation

import com.dn0ne.player.app.domain.metadata.Metadata
import com.dn0ne.player.app.domain.metadata.MetadataSearchResult
import com.dn0ne.player.app.domain.sort.PlaylistSort
import com.dn0ne.player.app.domain.sort.SortOrder
import com.dn0ne.player.app.domain.sort.TrackSort
import com.dn0ne.player.app.domain.track.Playlist
import com.dn0ne.player.app.domain.track.Track

sealed interface PlayerScreenEvent {
    data class OnTrackClick(val track: Track, val playlist: Playlist): PlayerScreenEvent

    data class OnPlayerExpandedChange(val isExpanded: Boolean): PlayerScreenEvent
    data class OnLyricsSheetExpandedChange(val isExpanded: Boolean): PlayerScreenEvent

    data object OnPlayClick: PlayerScreenEvent
    data object OnPauseClick: PlayerScreenEvent
    data object OnSeekToNextClick: PlayerScreenEvent
    data object OnSeekToPreviousClick: PlayerScreenEvent
    data class OnSeekTo(val position: Long): PlayerScreenEvent

    data object OnPlaybackModeClick: PlayerScreenEvent
    data object OnLyricsClick: PlayerScreenEvent

    data class OnPlayNextClick(val track: Track): PlayerScreenEvent
    data class OnAddToQueueClick(val track: Track): PlayerScreenEvent
    data class OnViewTrackInfoClick(val track: Track): PlayerScreenEvent
    data object OnCloseTrackInfoSheetClick: PlayerScreenEvent
    data object OnAcceptingRisksOfMetadataEditing: PlayerScreenEvent
    data class OnSearchInfo(val query: String): PlayerScreenEvent
    data object OnMatchDurationWhenSearchMetadataClick: PlayerScreenEvent
    data class OnMetadataSearchResultPick(val searchResult: MetadataSearchResult): PlayerScreenEvent
    data class OnOverwriteMetadataClick(val metadata: Metadata): PlayerScreenEvent
    data object OnRestoreCoverArtClick: PlayerScreenEvent
    data class OnConfirmMetadataEditClick(val metadata: Metadata): PlayerScreenEvent

    data class OnPlaylistSelection(val playlist: Playlist): PlayerScreenEvent

    data class OnTrackSortChange(
        val sort: TrackSort? = null,
        val order: SortOrder? = null
    ): PlayerScreenEvent
    data class OnPlaylistSortChange(
        val sort: PlaylistSort? = null,
        val order: SortOrder? = null
    ): PlayerScreenEvent

    data class OnCreatePlaylistClick(val name: String): PlayerScreenEvent
    data class OnRenamePlaylistClick(val name: String, val playlist: Playlist): PlayerScreenEvent
    data class OnDeletePlaylistClick(val playlist: Playlist): PlayerScreenEvent
    data class OnAddToPlaylist(val track: Track, val playlist: Playlist): PlayerScreenEvent
    data class OnRemoveFromPlaylist(val track: Track, val playlist: Playlist): PlayerScreenEvent
    data class OnPlaylistReorder(val trackList: List<Track>, val playlist: Playlist): PlayerScreenEvent
}