package com.sedmelluq.discord.lavaplayer.track.playback;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.track.AudioLoop;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackState;

/**
 * Executor which handles track execution and all operations on playing tracks.
 */
public interface AudioTrackExecutor extends AudioFrameProvider {
  /**
   * @return The audio buffer of this executor.
   */
  AudioFrameBuffer getAudioBuffer();

  /**
   * Execute the track, which means that this thread will fill the frame buffer until the track finishes or is stopped.
   * @param player The AudioPlayer which is running this executor
   */
  void execute(AudioPlayer player);

  /**
   * Stop playing the track, terminating the thread that is filling the frame buffer.
   */
  void stop();

  /**
   * @return Timecode of the last played frame or in case a seek is in progress, the timecode of the frame being seeked to.
   */
  long getPosition();

  /**
   * Perform seek to the specified timecode.
   * @param timecode The timecode in milliseconds
   */
  void setPosition(long timecode);

  /**
   * @return Current state of the executor
   */
  AudioTrackState getState();

  /**
   * Set the playback to loop between specified timecodes.
   * @param loop The loop to set. Use null to cancel a previous loop.
   */
  void setLoop(AudioLoop loop);
}
