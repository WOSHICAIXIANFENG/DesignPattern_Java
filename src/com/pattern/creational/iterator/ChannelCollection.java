package com.pattern.creational.iterator;

// Note: no method that returns the list of channels
// Our collection interface
public interface ChannelCollection {
	public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
}
