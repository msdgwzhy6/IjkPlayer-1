package com.leo.ijkplayer.media.videoview;

import android.graphics.Bitmap;

import com.leo.ijkplayer.media.Settings;

import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;

/**
 * Created on 2017/8/7 上午10:07.
 * leo linxiaotao1993@vip.qq.com
 */

public interface IVideoView {

    Bitmap getPauseBitmap();

    void setPauseBitmap(Bitmap pauseBitmap);

    void openVideo();

    void setSettings(Settings settings);

    Settings getSettings();

    void onCreatePlayer(IMediaPlayer mp);

    void onPausePlayer(IMediaPlayer mp);

    void onStartPlayer(IMediaPlayer mp);

    void onReleasePlayer();

    void onPrepared(IMediaPlayer mp);

    void onCompletion(IMediaPlayer mp);

    void onBufferingUpdate(IMediaPlayer mp, int percent);

    void onSeekComplete(IMediaPlayer mp);

    boolean onError(IMediaPlayer mp, int what, int extra);

    boolean onInfo(IMediaPlayer mp, int what, int extra);

    void onVideoSizeChanged(IMediaPlayer mp, int width, int height,
                            int sar_num, int sar_den);

    void onTimedText(IMediaPlayer mp, IjkTimedText text);
}
