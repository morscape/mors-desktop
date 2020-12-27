package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSSequenceDefinition extends RSNode
{
//	@Import("stretches")
//	boolean getStretches();
//
//	@Import("maxLoops")
//	int getMaxLoops();
//
//	@Import("precedenceAnimating") --- All unused
//	int getPrecedenceAnimating();
//
//	@Import("replyMode")
//	int getReplyMode();
//
//	@Import("interleaveLeave")
//	int[] getInterleaveLeave();

	@Import("frameIds")
	int[] getFrameIDs();

	@Import("frameLengths")
	int[] getFrameLengths();

	@Import("chatFrameIds")
	int[] getChatFrameIds();
}
